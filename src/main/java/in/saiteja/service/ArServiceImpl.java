/**
 * 
 */
package in.saiteja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.saiteja.binding.CitizenApp;
import in.saiteja.entity.CitizenAppEntity;
import in.saiteja.repo.CitizenAppRepo;

/**
 * @author K.SAITEJA
 *
 */
public class ArServiceImpl implements ArService {

	@Autowired
	CitizenAppRepo citizenAppRepo;
	
	@Override
	public Integer createApplicaion(CitizenApp app) {
		
		String endPoint="https://ssa-web-api.herokuapp.com/ssn/{ssn}";
		RestTemplate rest = new RestTemplate();
		ResponseEntity<String> restEntity = rest.getForEntity(endPoint, String.class,app.getSSN());
		String state = restEntity.getBody();
		if("New Jersery".equals(state)) {
			// creating the application 
			CitizenAppEntity entity = new CitizenAppEntity();
			CitizenAppEntity save = citizenAppRepo.save(entity);
			return save.getAppId();
		}
		
		return 0;
	}

	
}
