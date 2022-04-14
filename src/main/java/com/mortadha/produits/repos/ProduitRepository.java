package com.mortadha.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mortadha.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
