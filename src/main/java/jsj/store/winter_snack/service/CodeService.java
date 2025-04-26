package jsj.store.winter_snack.service;

import jsj.store.winter_snack.dto.CodeDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CodeService {

    private final SqlSession sqlSession;

    public List<CodeDto> getCodes() {
        return sqlSession.selectList("CodeMapper.selectAll");
    }

    public void insertCode(CodeDto codeDto) {
        sqlSession.insert("CodeMapper.insertCode", codeDto);
    }

}
