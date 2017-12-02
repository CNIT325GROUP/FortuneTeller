/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaz
 */
public class Relationship extends Category {
    //attributes
    String relationshipName;
    String relationshipType;
    Family relationshipFamily;
    Friend relationshipFriend;
    Romance relationshipRomance;
    
    //methods
    public void setRelationshipName (String relationshipname) {
        relationshipName = relationshipname;
    }
    public String getRelationshipName () {
        return relationshipName;
    }
    public void setRelationshipType (String relationshiptype) {
        relationshipType = relationshiptype;
    }
    public String getRelationshipType () {
        return relationshipType;
    }
    public void setRelationshipFriend (Friend relationshipfriend) {
        relationshipFriend = relationshipfriend;
    }
    public Friend getRelationshipFriend () {
        return relationshipFriend;
    }
    public void setRelationshipRomance (Romance relationshipromance) {
        relationshipRomance = relationshipromance;
    }
    public Romance getRelationlshipRomance () {
        return relationshipRomance;
    }
    public void setRelationshipFamily (Family relationshipfamily) {
        relationshipFamily = relationshipfamily;
    }
    public Family getRelationshipFamily () {
        return relationshipFamily;
    }
}
