package modele;
// Generated 1 juin 2014 14:56:19 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Etablissement generated by hbm2java
 */
@Entity
@Table(name="etablissement"
    ,catalog="pfa1"
)
public class Etablissement  implements java.io.Serializable {


     private int codeEtab;
     private Universite universite;
     private String libEtab;
     private Set<Chercheur> chercheursForEtaCodeEtab = new HashSet<Chercheur>(0);
     private Set<Chercheur> chercheursForEtaCodeEtab2 = new HashSet<Chercheur>(0);
     private Set<Chercheur> chercheursForCodeEtab = new HashSet<Chercheur>(0);
     private Set<Structurerecherche> structurerecherches = new HashSet<Structurerecherche>(0);
     private Set<Obtenir> obtenirs = new HashSet<Obtenir>(0);

    public Etablissement() {
    }

	
    public Etablissement(int codeEtab, Universite universite) {
        this.codeEtab = codeEtab;
        this.universite = universite;
    }
    public Etablissement(int codeEtab, Universite universite, String libEtab, Set<Chercheur> chercheursForEtaCodeEtab, Set<Chercheur> chercheursForEtaCodeEtab2, Set<Chercheur> chercheursForCodeEtab, Set<Structurerecherche> structurerecherches, Set<Obtenir> obtenirs) {
       this.codeEtab = codeEtab;
       this.universite = universite;
       this.libEtab = libEtab;
       this.chercheursForEtaCodeEtab = chercheursForEtaCodeEtab;
       this.chercheursForEtaCodeEtab2 = chercheursForEtaCodeEtab2;
       this.chercheursForCodeEtab = chercheursForCodeEtab;
       this.structurerecherches = structurerecherches;
       this.obtenirs = obtenirs;
    }
   
     @Id 
    
    @Column(name="CodeEtab", unique=true, nullable=false)
    public int getCodeEtab() {
        return this.codeEtab;
    }
    
    public void setCodeEtab(int codeEtab) {
        this.codeEtab = codeEtab;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CodeUniv", nullable=false)
    public Universite getUniversite() {
        return this.universite;
    }
    
    public void setUniversite(Universite universite) {
        this.universite = universite;
    }
    
    @Column(name="LibEtab", length=254)
    public String getLibEtab() {
        return this.libEtab;
    }
    
    public void setLibEtab(String libEtab) {
        this.libEtab = libEtab;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="etablissementByEtaCodeEtab")
    public Set<Chercheur> getChercheursForEtaCodeEtab() {
        return this.chercheursForEtaCodeEtab;
    }
    
    public void setChercheursForEtaCodeEtab(Set<Chercheur> chercheursForEtaCodeEtab) {
        this.chercheursForEtaCodeEtab = chercheursForEtaCodeEtab;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="etablissementByEtaCodeEtab2")
    public Set<Chercheur> getChercheursForEtaCodeEtab2() {
        return this.chercheursForEtaCodeEtab2;
    }
    
    public void setChercheursForEtaCodeEtab2(Set<Chercheur> chercheursForEtaCodeEtab2) {
        this.chercheursForEtaCodeEtab2 = chercheursForEtaCodeEtab2;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="etablissementByCodeEtab")
    public Set<Chercheur> getChercheursForCodeEtab() {
        return this.chercheursForCodeEtab;
    }
    
    public void setChercheursForCodeEtab(Set<Chercheur> chercheursForCodeEtab) {
        this.chercheursForCodeEtab = chercheursForCodeEtab;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="etablissement")
    public Set<Structurerecherche> getStructurerecherches() {
        return this.structurerecherches;
    }
    
    public void setStructurerecherches(Set<Structurerecherche> structurerecherches) {
        this.structurerecherches = structurerecherches;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="etablissement")
    public Set<Obtenir> getObtenirs() {
        return this.obtenirs;
    }
    
    public void setObtenirs(Set<Obtenir> obtenirs) {
        this.obtenirs = obtenirs;
    }




}

