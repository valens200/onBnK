package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Beneficially;

import java.util.List;

public interface Beneficially {
    public List<Beneficially> getAllBeneficiallies();
    public Beneficially getBeneficiallyById(long id);
    public  boolean saveBeneficially(Beneficially beneficially);
    public boolean deleteBeneficiallyById(long id);


}