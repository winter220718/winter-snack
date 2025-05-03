package jsj.store.winter_snack.service;

import jsj.store.winter_snack.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final SqlSession sqlSession;

    public List<ItemDto> selectItembyCty(String codeDc) {
        return sqlSession.selectList("HomeMapper.selectItembyCty", codeDc);
    }
}
