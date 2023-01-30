package rw.ac.onbank.orm.appDos.deos.daos;

import rw.ac.onbank.orm.entities.Address;

import java.util.List;

public interface AddressDao{
    public List<Address>getAllAdresses();
    public Address getAdressById(long id);
    public boolean saveAddress(Address address);
    public boolean deleAddressById(long id);
}