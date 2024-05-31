package com.example.demo.Repository;


import com.example.demo.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface ClientRepository extends JpaRepository<Client, Long> {

}

