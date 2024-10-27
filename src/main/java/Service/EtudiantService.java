package Service;

import Entity.Etudiant;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface EtudiantService {

    @WebMethod
    public List<Etudiant> getAllEtudiants();

    @WebMethod
    public List<Etudiant> getEtudiantsLimit(int limit);

    @WebMethod
    public Etudiant getEtudiantByCIN(String cin);
}
