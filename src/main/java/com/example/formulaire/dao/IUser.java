package com.example.formulaire.dao;

import com.example.formulaire.sn.icagi.entities.Secretaire;
import com.example.formulaire.sn.icagi.entities.User;

public interface IUser {
    public User getConnection(String email, String password);
}
