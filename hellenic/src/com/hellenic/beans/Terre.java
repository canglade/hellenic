package com.hellenic.beans;

public class Terre extends Propriete {
    private String  ref;
    private boolean isContructible;

    // TODO voir les attribus

    Terre() {
        super();
    }

    public String getRef() {
        return ref;
    }

    public void setRef( String ref ) {
        this.ref = ref;
    }

    public boolean isContructible() {
        return isContructible;
    }

    public void setContructible( boolean isContructible ) {
        this.isContructible = isContructible;
    }

}
