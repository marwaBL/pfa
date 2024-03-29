package test;
// Generated 18 avr. 2014 00:52:28 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Obtenir generated by hbm2java
 */
@Entity
@Table(name="obtenir"
    ,catalog="pfa1"
)
public class Obtenir  implements java.io.Serializable {


     private ObtenirId id;
     private Chercheur chercheur;
     private Diplome diplome;
     private Etablissement etablissement;
     private Date date;

    public Obtenir() {
    }

    public Obtenir(ObtenirId id, Chercheur chercheur, Diplome diplome, Etablissement etablissement, Date date) {
       this.id = id;
       this.chercheur = chercheur;
       this.diplome = diplome;
       this.etablissement = etablissement;
       this.date = date;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idCh", column=@Column(name="IdCh", nullable=false) ), 
        @AttributeOverride(name="idD", column=@Column(name="Id_D", nullable=false) ), 
        @AttributeOverride(name="codeEtab", column=@Column(name="CodeEtab", nullable=false) ) } )
    public ObtenirId getId() {
        return this.id;
    }
    
    public void setId(ObtenirId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IdCh", nullable=false, insertable=false, updatable=false)
    public Chercheur getChercheur() {
        return this.chercheur;
    }
    
    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_D", nullable=false, insertable=false, updatable=false)
    public Diplome getDiplome() {
        return this.diplome;
    }
    
    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CodeEtab", nullable=false, insertable=false, updatable=false)
    public Etablissement getEtablissement() {
        return this.etablissement;
    }
    
    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Date", nullable=false, length=19)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


