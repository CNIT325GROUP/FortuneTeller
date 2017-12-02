/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaz
 */
public class Category extends FortuneTeller{
    //attributes
    FortuneTeller fortuneTeller;
    String categoryName;
    Health categoryHealth;
    Career categoryCareer;
    Education categoryEducation;
    Hobbies categoryHobbies;
    Relationship categoryRelationship;
    
    //methods
    public void setFortuneTeller (FortuneTeller fortuneteller) {
            fortuneTeller = fortuneteller;
    }
    public FortuneTeller getFortuneTeller () {
        return fortuneTeller;
    }
    public void setCategoryName (String categoryname) {
        categoryName = categoryname;
    }
    public String getCategoryName () {
        return categoryName;
    }
    public void setCategoryHealth (Health categoryhealth) {
        categoryHealth = categoryhealth;
    }
    public Health getCategoryHealth () {
        return categoryHealth;
    }
    public void setcategoryCareer (Career categorycareer) {
        categoryCareer = categorycareer;
    }
    public Career getCategoryCareer () {
        return categoryCareer;
    }
    public void setCategoryEducation (Education categoryeducation) {
        categoryEducation = categoryeducation;
    }
    public Education getCategoryEducation () {
        return categoryEducation;
    }
    public void setCategoryHobbies (Hobbies categoryhobbies) {
        categoryHobbies = categoryhobbies;
    }
    public Hobbies getCategoryHobbies () {
        return categoryHobbies;
    }
    public void setCategoryRelationship (Relationship categoryrelationship) {
        categoryRelationship = categoryrelationship;
    }
    public Relationship getCategoryRelationship () {
        return categoryRelationship;
    }
}
