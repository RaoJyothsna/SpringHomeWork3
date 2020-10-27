package example.dao;


import example.entities.City;

public interface CityDao {
        public City save(City city);
        public City findById(int id);
        public City update(City city);
        public void delete(City city);
    }
