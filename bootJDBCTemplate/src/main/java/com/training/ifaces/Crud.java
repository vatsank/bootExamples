package com.training.ifaces;

import java.util.List;

public interface Crud<T> {

  public List<T>	findAll();
}
