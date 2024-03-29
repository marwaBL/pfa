package test;
// Generated 18 avr. 2014 00:52:28 by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserId generated by hbm2java
 */
@Embeddable
public class UserId  implements java.io.Serializable {


     private String passwd;
     private String login;

    public UserId() {
    }

    public UserId(String passwd, String login) {
       this.passwd = passwd;
       this.login = login;
    }
   

    @Column(name="Passwd", nullable=false, length=254)
    public String getPasswd() {
        return this.passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Column(name="Login", nullable=false, length=254)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserId) ) return false;
		 UserId castOther = ( UserId ) other; 
         
		 return ( (this.getPasswd()==castOther.getPasswd()) || ( this.getPasswd()!=null && castOther.getPasswd()!=null && this.getPasswd().equals(castOther.getPasswd()) ) )
 && ( (this.getLogin()==castOther.getLogin()) || ( this.getLogin()!=null && castOther.getLogin()!=null && this.getLogin().equals(castOther.getLogin()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPasswd() == null ? 0 : this.getPasswd().hashCode() );
         result = 37 * result + ( getLogin() == null ? 0 : this.getLogin().hashCode() );
         return result;
   }   


}


