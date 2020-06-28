package com.company.model;

import com.sun.javafx.geom.transform.Identity;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;


@Entity
public class CorvidForm {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long corvidFormPk;

    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String personalCode;
    @Column
    private Boolean signature;

    public Long getCorvidFormPk() {
        return corvidFormPk;
    }

    public void setCorvidFormPk(Long corvidFormPk) {
        this.corvidFormPk = corvidFormPk;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public Boolean getSignature() {
        return signature;
    }

    public void setSignature(Boolean signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "CorvidForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalCode='" + personalCode + '\'' +
                ", signature=" + signature +
                '}';
    }
}
