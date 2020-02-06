package springGit0206_ex.message.mapper;

import java.util.List;

import springGit0206_ex.message.dto.MessageDto;

public interface SelectMapper {
     public List<MessageDto> selectAll();
     
     public MessageDto selectOne(int num);
}
