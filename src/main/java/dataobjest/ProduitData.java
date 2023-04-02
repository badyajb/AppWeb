package dataobjest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.produit;



public class ProduitData {
	private Connection con;

	private String query;
    private PreparedStatement pst;
    private ResultSet rs;
    public ProduitData(Connection con) {
		super();
		this.con = con;
	}
    public List<produit> getAllProducts() {
        List<produit> products = new ArrayList<>();
        try {

            query = "select * from product";
            pst = this.con.prepareStatement(query);
            rs = pst.executeQuery();

            while (rs.next()) {
            	produit row = new produit();
                row.setId(rs.getInt("id"));
                row.setNamep(rs.getString("namep"));
                row.setCategory(rs.getString("category"));
                row.setPrice(rs.getDouble("price"));
                row.setImage(rs.getString("image"));

                products.add(row);
            }

        } catch (SQLException e) {
            e.printStackTrace();
           
        }
        return products;
    }
    

}
