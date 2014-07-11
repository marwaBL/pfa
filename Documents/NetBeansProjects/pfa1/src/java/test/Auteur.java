package test;
// Generated 18 avr. 2014 00:52:28 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Auteur generated by hbm2java
 */
@Entity
@Table(name="auteur"
    ,catalog="pfa1"
)
public class Auteur  implements java.io.Serializable {


     private Integer idAut;
     private Chercheur chercheur;
     private String nomAut;
     private String prenomAut;
     private Set<Ecrire> ecrires = new HashSet<Ecrire>(0);

    public Auteur() {
    }

    public Auteur(Chercheur chercheur, String nomAut, String prenomAut, Set<Ecrire> ecrires) {
       this.chercheur = chercheur;
       this.nomAut = nomAut;
       this.prenomAut = prenomAut;
       this.ecrires = ecrires;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="IdAut", unique=true, nullable=false)
    public Integer getIdAut() {
        return this.idAut;
    }
    
    public void setIdAut(Integer idAut) {
        this.idAut = idAut;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IdCh")
    public Chercheur getChercheur() {
        return this.chercheur;
    }
    
    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }
    
    @Column(name="NomAut", length=254)
    public String getNomAut() {
        return this.nomAut;
    }
    
    public void setNomAut(String nomAut) {
        this.nomAut = nomAut;
    }
    
    @Column(name="PrenomAut", length=254)
    public String getPrenomAut() {
        return this.prenomAut;
    }
    
    public void setPrenomAut(String prenomAut) {
        this.prenomAut = prenomAut;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="auteur")
    public Set<Ecrire> getEcrires() {
        return this.ecrires;
    }
    
    public void setEcrires(Set<Ecrire> ecrires) {
        this.ecrires = ecrires;
    }




}

