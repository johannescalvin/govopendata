package govopendata.thesaurus.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/subjectword/relationtypelist")
public class SubjectWordRelationController {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<SubjectWordRelation>	getTypeList(){
		 List<SubjectWordRelation> list = new ArrayList<SubjectWordRelation>();
		for(SubjectWordRelation relation : SubjectWordRelation.values()){
			list.add(relation);
		}
		return list;
	}
}
