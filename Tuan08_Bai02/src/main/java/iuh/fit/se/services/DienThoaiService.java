package iuh.fit.se.services;

import iuh.fit.se.entities.DienThoai;
import java.util.List;

public interface DienThoaiService {
    List<DienThoai> findAll();
    List<DienThoai> findByNCC(String maNCC);
    void save(DienThoai dt);
    void delete(String id);
    DienThoai findById(String id);
}
