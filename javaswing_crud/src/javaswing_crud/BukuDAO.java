package javaswing_crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BukuDAO {
    private Connection connection;

    public BukuDAO() throws SQLException {
        connection = DBConnection.getConnection();
    }

    // READ
    public List<Buku> getBuku() throws SQLException {
        List<Buku> bukuList = new ArrayList<>();
        String sql = "SELECT * FROM buku";

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id_buku");
                String nama = rs.getString("nama");
                String author = rs.getString("author");
                String tahun = rs.getString("tahun");
                int jumlah = rs.getInt("jumlah");  // perbaikan: getInt
                String status = rs.getString("status");

                bukuList.add(new Buku(id, nama, author, tahun, jumlah, status));
            }
        }

        return bukuList;
    }

    // INSERT
    public int insertBuku(Buku buku) throws SQLException {
        String sql = "INSERT INTO buku (nama, author, tahun, jumlah, status) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, buku.getNama());
            stmt.setString(2, buku.getAuthor());
            stmt.setString(3, buku.getTahun());
            stmt.setInt(4, buku.getJumlah());  // perbaikan: setInt
            stmt.setString(5, buku.getStatus());

            return stmt.executeUpdate();
        }
    }

    // UPDATE
    public int updateBuku(Buku buku) throws SQLException {
        String sql = "UPDATE buku SET nama = ?, author = ?, tahun = ?, jumlah = ?, status = ? WHERE id_buku = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, buku.getNama());
            stmt.setString(2, buku.getAuthor());
            stmt.setString(3, buku.getTahun());
            stmt.setInt(4, buku.getJumlah());  // perbaikan: setInt
            stmt.setString(5, buku.getStatus());
            stmt.setInt(6, buku.getId());

            return stmt.executeUpdate();
        }
    }

    // DELETE
    public int deleteBuku(int id) throws SQLException {
        String sql = "DELETE FROM buku WHERE id_buku = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate();
        }
    }

    // tambahan: ambil buku berdasarkan id
    public Buku getBukuById(int id) throws SQLException {
        String sql = "SELECT * FROM buku WHERE id_buku = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nama = rs.getString("nama");
                    String author = rs.getString("author");
                    String tahun = rs.getString("tahun");
                    int jumlah = rs.getInt("jumlah");
                    String status = rs.getString("status");
                    return new Buku(id, nama, author, tahun, jumlah, status);
                }
            }
        }
        return null;
    }

    // tambahan: fungsi pinjam buku otomatis kurangi jumlah 1
    public boolean pinjamBuku(int id) throws SQLException {
        Buku buku = getBukuById(id);
        if (buku == null) return false;
        if (buku.getJumlah() <= 0) return false;

        buku.setJumlah(buku.getJumlah() - 1);
        updateBuku(buku);
        return true;
    }
}

