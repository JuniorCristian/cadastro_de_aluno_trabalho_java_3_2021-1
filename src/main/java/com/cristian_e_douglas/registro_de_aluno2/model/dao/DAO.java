package com.cristian_e_douglas.registro_de_aluno2.model.dao;

import java.util.List;

public interface DAO<T> {
    public T create(T obj);
    public List<T> read();
    public T read(int id);
    public void update(T obj);
    public void delete(int id);
    public void delete(T obj);
}
