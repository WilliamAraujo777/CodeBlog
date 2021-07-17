package com.spring.codeblog.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*import javax.annotation.PostConstruct;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Publicacao;
import com.spring.codeblog.repository.CodeBlogRepository;

@Component
public class DummyData {

	@Autowired
	CodeBlogRepository rp;
	
	//@PostConstruct
	public void savePub() {
		
		Publicacao pub1 = new Publicacao();
		List<Publicacao> listPubs = new ArrayList<Publicacao>();
		
		pub1.setAutor("William");
		pub1.setTitulo("Blog em SpringBoot");
		pub1.setData_pub(LocalDate.now());
		pub1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nunc aliquet bibendum enim facilisis gravida neque convallis a. Fringilla phasellus faucibus scelerisque eleifend donec pretium vulputate sapien. Purus ut faucibus pulvinar elementum integer enim neque volutpat. Libero justo laoreet sit amet. Donec adipiscing tristique risus nec feugiat. Ultrices gravida dictum fusce ut placerat orci nulla. Nisi vitae suscipit tellus mauris a. Risus pretium quam vulputate dignissim suspendisse in est ante. Cras pulvinar mattis nunc sed blandit libero volutpat sed cras. Ullamcorper morbi tincidunt ornare massa eget. Dictum non consectetur a erat nam at lectus urna. Tempus urna et pharetra pharetra massa massa. Id interdum velit laoreet id donec ultrices tincidunt arcu non. Consectetur a erat nam at lectus. Augue neque gravida in fermentum et sollicitudin ac. Aliquet eget sit amet tellus cras. Praesent elementum facilisis leo vel fringilla est ullamcorper. Nulla at volutpat diam ut venenatis tellus in metus. Varius duis at consectetur lorem.");
		
		Publicacao pub2 = new Publicacao();
		pub2.setAutor("Will");
		pub2.setTitulo("SpringSecurity");
		pub2.setData_pub(LocalDate.now());
		pub2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Nunc aliquet bibendum enim facilisis gravida neque convallis a. Fringilla phasellus faucibus scelerisque eleifend donec pretium vulputate sapien. Purus ut faucibus pulvinar elementum integer enim neque volutpat. Libero justo laoreet sit amet. Donec adipiscing tristique risus nec feugiat. Ultrices gravida dictum fusce ut placerat orci nulla. Nisi vitae suscipit tellus mauris a. Risus pretium quam vulputate dignissim suspendisse in est ante. Cras pulvinar mattis nunc sed blandit libero volutpat sed cras. Ullamcorper morbi tincidunt ornare massa eget. Dictum non consectetur a erat nam at lectus urna. Tempus urna et pharetra pharetra massa massa. Id interdum velit laoreet id donec ultrices tincidunt arcu non. Consectetur a erat nam at lectus. Augue neque gravida in fermentum et sollicitudin ac. Aliquet eget sit amet tellus cras. Praesent elementum facilisis leo vel fringilla est ullamcorper. Nulla at volutpat diam ut venenatis tellus in metus. Varius duis at consectetur lorem.");
		
		
		listPubs.add(pub1);
		listPubs.add(pub2);
		
		for(Publicacao pub: listPubs) {
			
			Publicacao pubSaved = rp.save(pub);
			System.out.println(pubSaved.getId());

		}
		
		
	}
	
	
}
