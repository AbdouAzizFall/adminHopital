package com.example.formulaire.dao;

import com.example.formulaire.sn.icagi.entities.RendezVous;

import java.util.List;

public interface IRendezVous {
    public int add(RendezVous rv);
    public int update(RendezVous rv);
    public int delete(int id);
    public List<RendezVous> getAll();
}
