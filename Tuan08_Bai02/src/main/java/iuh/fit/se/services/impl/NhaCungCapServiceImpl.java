package iuh.fit.se.services.impl;

import iuh.fit.se.entities.NhaCungCap;
import iuh.fit.se.repositories.NhaCungCapRepository;
import iuh.fit.se.services.NhaCungCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhaCungCapServiceImpl implements NhaCungCapService {

    @Autowired
    private NhaCungCapRepository repo;

    @Override
    public List<NhaCungCap> findAll() {
        return repo.findAll();
    }

    @Override
    public List<NhaCungCap> search(String keyword) {
        return repo.findByMaNCCContainingOrTenNhaCCContainingOrDiaChiContainingOrSoDienThoaiContaining(
                keyword, keyword, keyword, keyword);
    }

    @Override
    public NhaCungCap findById(String id) {
        return repo.findById(id).orElse(null);
    }
}
