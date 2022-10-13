/**
 * 
 */
package in.saiteja.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.saiteja.binding.CitizenApp;
import in.saiteja.service.ArService;

/**
 * @author K.SAITEJA
 *
 */
@RestController
public class ArCitizenController {
	
	@Autowired
	ArService arService;

	@PostMapping
	public ResponseEntity<String> createCitizenApplicaion(@RequestBody CitizenApp app){
		
		Integer appId = arService.createApplicaion(app);
		if(appId>0) {
			return new ResponseEntity<>("Applicaion is Created"+appId,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("Invalid SSN"+appId,HttpStatus.BAD_REQUEST);
		}
	}
}
