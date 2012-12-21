package com.hellenic.metier;

import java.util.ArrayList;

import com.hellenic.DAO.ProprieteDao;
import com.hellenic.beans.ProprieteBean;

public class Propriete {
    private ProprieteDao proprieteDao;

    public Propriete( ProprieteDao proprieteDao ) {
        this.proprieteDao = proprieteDao;
    }

    public ArrayList<ProprieteBean> listingPropriete( int nbPropriete ) {
        ArrayList<ProprieteBean> lesProprietes = proprieteDao.linstingPropriete( nbPropriete );
        return lesProprietes;
    }

}
