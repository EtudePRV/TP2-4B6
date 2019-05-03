package Outils;

public interface Constante {
	String CONNECTIONSTRING = "jdbc:sqlite:DB/bibliothequemusic_vellone.db";
	// table artiste
	String SELECT_USER = "SELECT * FROM users Where name = ";
	String SELECT_ARTISTE = "SELECT id,nom,membre,photo FROM artistes Where id = ";
	String SELECT_ARTISTE_NAME = "SELECT id,nom FROM artistes Where nom = ";
	String SELECT_ARTISTES = "SELECT id as 'ID',nom as 'Nom' ,case when membre = 1 then 'Oui'when membre = 0 then 'Non' else 'N/A'end as 'Membre' FROM artistes Where nom Like ";
	String ADD_ARTISTE = "INSERT INTO artistes (nom,membre,photo) VALUES ";
	String UPDATE_ARTISTE = "UPDATE artistes Set ";
	String DELETE_ARTISTE = "DELETE FROM artistes WHERE ID = ";
	// table album
	String SELECT_ALBUM = "SELECT id,titre,idgenre,annee,image,idartise FROM albums Where id = ";
	String SELECT_ALBUMS_ARTIST = "SELECT idartise,titre FROM albums Where idartise = ";
	String SELECT_ALBUM_NAME = "SELECT titre FROM albums Where titre = ";
	String SELECT_ALBUMS = "SELECT albums.id as 'ID',titre as 'Titre',genres.nom as 'Genre',annee as'Année', artistes.nom as 'Artiste' FROM albums "
			+ "LEFT JOIN artistes on albums.idartise = artistes.id "
			+ "LEFT JOIN genres on albums.idgenre = genres.id "
			+ "Where titre Like ";
	String ADD_ALBUM = "INSERT INTO albums (titre,idgenre,annee,image,idartise) VALUES ";
	String UPDATE_ALBUM = "UPDATE albums Set ";
	String DELETE_ALBUM = "DELETE FROM albums WHERE ID = ";
	// genre
	String SELECT_GENRES = "SELECT id,nom FROM genres";
	String SELECT_GENRE = "SELECT id,nom FROM genres where nom = ";
	String SELECT_GENRE_NAME = "SELECT id,nom FROM genres Where nom = ";
}
