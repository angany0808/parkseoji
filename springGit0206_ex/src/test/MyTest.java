package test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springGit0206_ex.message.dto.MessageDto;
import springGit0206_ex.message.mapper.InsertMapper;
import springGit0206_ex.message.mapper.UpdateMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/springContext.xml")
public class MyTest {
	
	@Autowired
	InsertMapper insertMapper;
	@Autowired
	UpdateMapper updateMapper;
	
	@Test@Ignore
	public void insertTest() {
		insertMapper.insert(new MessageDto(0, "지태환", "퍼킹", LocalDateTime.now()));
	}
	@Test
	public void updateTest() {
		updateMapper.update(new MessageDto(17, "하하", "로사 오우 내사랑 로싸", null));;
	}

}
