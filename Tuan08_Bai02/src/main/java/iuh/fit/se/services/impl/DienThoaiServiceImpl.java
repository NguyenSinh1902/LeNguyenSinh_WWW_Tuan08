package iuh.fit.se.services.impl;

import iuh.fit.se.entities.DienThoai;
import iuh.fit.se.repositories.DienThoaiRepository;
import iuh.fit.se.services.DienThoaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DienThoaiServiceImpl implements DienThoaiService {

    @Autowired
    private DienThoaiRepository repo;

    @Override
    public List<DienThoai> findAll() {
        return repo.findAll();
    }

    @Override
    public List<DienThoai> findByNCC(String maNCC) {
        return repo.findByNhaCungCap_MaNCC(maNCC);
    }

    @Override
    public void save(DienThoai dt) {
        repo.save(dt);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }

    @Override
    public DienThoai findById(String id) {
        return repo.findById(id).orElse(null);
    }
}
