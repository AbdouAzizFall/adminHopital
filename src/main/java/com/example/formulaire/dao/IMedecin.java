package com.example.formulaire.dao;

import com.example.formulaire.sn.icagi.entities.Medecin;
import com.example.formulaire.sn.icagi.entities.RendezVous;

import java.util.List;

public interface IMedecin {
    public List<RendezVous> getRvByMedcin(int id);
    public Medecin get(int id);
    public int add(Medecin medecin);
}
