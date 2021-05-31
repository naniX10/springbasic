package nanix.spring.annotation;

import org.springframework.stereotype.Repository;

import nanix.spring.sungJuk.SungJuk;
import nanix.spring.sungJuk.SungJukDAO;

@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가???");
		
	}

}
