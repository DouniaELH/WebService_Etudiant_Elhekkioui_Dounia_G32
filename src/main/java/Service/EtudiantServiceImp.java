package Service;

import Entity.Etudiant;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@WebService
public class EtudiantServiceImp implements EtudiantService {


    private  List<Etudiant> etudiants = new ArrayList<>(Arrays.asList(
            new Etudiant(1, "Ali El Amrani", "CIN12345", "1998-02-15", "Informatique"),
            new Etudiant(2, "Fatima Zahra", "CIN67890", "1997-06-20", "Mathématiques"),
            new Etudiant(3, "Jihane Mouataz", "CIN45342", "1998-01-11", "Informatique")

    ));
    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
    @Override
    public List<Etudiant> getEtudiantsLimit(int limit) {

        return etudiants.stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    @Override
    public Etudiant getEtudiantByCIN(String cin) {
        return etudiants.stream()
                .filter(etudiant -> etudiant.getCin().equals(cin))
                .findFirst()
                .orElse(null);
    }

}
