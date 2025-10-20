package iuh.fit.se.services;

import iuh.fit.se.entities.NhaCungCap;
import java.util.List;

public interface NhaCungCapService {
    List<NhaCungCap> findAll();
    List<NhaCungCap> search(String keyword);
    NhaCungCap findById(String id);
}
