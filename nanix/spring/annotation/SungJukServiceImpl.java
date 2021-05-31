package nanix.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nanix.spring.sungJuk.SungJuk;
import nanix.spring.sungJuk.SungJukDAO;
import nanix.spring.sungJuk.SungJukService;

@Service("sjsrv")
public class SungJukServiceImpl implements SungJukService {

	@Autowired
	private SungJukDAO sdao;
		
	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk("길동",100,0,100);
		System.out.println("성적이 생성됬을까?");
		
		sdao.insertSungJuk(sj);
		
	}
	
}
