package Outils;

public interface Constante {
	String CONNECTIONSTRING = "jdbc:sqlite:DB/bibliothequemusic_vellone.db";
	String SELECT_USER = "SELECT * FROM users Where name = ";
	String SELECT_ARTISTE = "SELECT id,nom,membre,photo FROM artistes Where id = ";
	String SELECT_ARTISTE_NAME = "SELECT nom FROM artistes Where nom = ";
	String SELECT_ARTISTES = "SELECT id as 'ID',nom as 'Nom' ,case when membre = 1 then 'Oui'when membre = 0 then 'Non' else 'N/A'end as 'Membre' FROM artistes Where nom Like ";
	String ADD_ARTISTE = "INSERT INTO artistes (nom,membre,photo) VALUES ";
	String UPDATE_ARTISTE = "UPDATE artistes Set ";
	String DELETE_ARTISTE= "DELETE FROM artistes WHERE ID = ";
}
