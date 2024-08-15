package com.example.formulaire.dao;

import com.example.formulaire.sn.icagi.entities.Secretaire;

public interface ISecretaire {
    public int add(Secretaire secretaire);
    public Secretaire get(int id);
}