package tn.esprit.tic.azizallouche.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.tic.azizallouche.entities.*;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    @Query("select s from Skieur s where s.abonnement.typeAbon = ?1") //JPQL
    List<Skieur> findSkieurByAbonnement_TypeAbon(TypeAbonnement typeAbonnement); //keyword
    @Query("select s from Skieur s where s.abonnement.typeAbon =  :typeAbonnement and s.ville= :ville") //JPQL
    List<Skieur> findSkieurByAbonnement_TypeAbonJPQL(@Param("typeAbonnement") TypeAbonnement typeAbonnement, @Param("ville") String ville); //keyword
    @Query(value = "SELECT * " +
            "FROM skieur s "+
            "JOIN abonnement a" +
            "ON s.abonnement_num_abon = a.num_abon " +
            "WHERE a.type_abon=:typeAbonnement "+
            "AND s.ville=:ville", nativeQuery = true ) //SQL
    List<Skieur> findSkieurByAbonnement_TypeAbonSQL(@Param("typeAbonnement") TypeAbonnement typeAbonnement, @Param("ville") String ville); //keyword
    List<Skieur> findByInscriptionsCoursTypeCoursAndInscriptionsCoursSupportAndPistesCouleur(TypeCours inscriptions_cours_typeCours, Support inscriptions_cours_support, Couleur pistes_couleur);
    @Query(value = "SELECT * \n" +
            "FROM skieur s JOIN inscription i ON i.skieur_num_skieur=s.num_skieur \n" +
            "JOIN cours c ON i.cours_num_cours=c.num_cours \n" +
            "JOIN moniteur_cours mc ON c.num_cours=mc.moniteur_num_moniteur \n" +
            "JOIN moniteur m ON m.num_moniteur=mc.moniteur_num_moniteur \n" +
            "WHERE (c.support=:support) AND (m.nomm=:nom)",nativeQuery = true)

    List<Skieur> findByMoniteurNameAndSupportTypeSQL(@Param("support") Support support, @Param("nom") String nom);
    @Query("select i.skieur from Inscription i " +
            "JOIN Moniteur m ON i.cours member of m.cours " +
            "WHERE m.nomM=:nom AND i.cours.support=:support ") //JPQL
    List<Skieur> findByMoniteurNameAndSupportTypeJPQL(@Param("support") Support support, @Param("nom") String nom);
}
