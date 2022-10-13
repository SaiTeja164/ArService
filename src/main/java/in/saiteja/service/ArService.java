/**
 * 
 */
package in.saiteja.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import in.saiteja.binding.CitizenApp;
import in.saiteja.entity.CitizenAppEntity;

/**
 * @author K.SAITEJA
 *
 */
@Service
public interface ArService {

	public Integer createApplicaion(CitizenApp app) ;
}
