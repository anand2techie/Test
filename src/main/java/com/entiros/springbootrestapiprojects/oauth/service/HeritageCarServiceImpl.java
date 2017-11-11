package com.entiros.springbootrestapiprojects.oauth.service;

import com.entiros.springbootrestapiprojects.oauth.model.HeritageCar;
import com.entiros.springbootrestapiprojects.oauth.repository.HeritageCarRepository;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HeritageCarServiceImpl implements HeritageCarService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private HeritageCarRepository heritageCarRepository;

    @Autowired
    public void setHeritageCarRepository(HeritageCarRepository heritageCarRepository) {
        this.heritageCarRepository = heritageCarRepository;
    }
 /*   
    private AccountsRepository accountsRepository;

    @Autowired
    public void setAccountsRepository(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }*/

    @Override
    public Iterable<HeritageCar> listAllHeritageCars() {
        logger.debug("listAllHeritageCars called");
        return heritageCarRepository.findAll();
    }

    @Override
    public HeritageCar getHeritageCarById(String id) {
        logger.debug("getHeritageCarById called");
        return heritageCarRepository.findById(id);
    }

    @Override
    public HeritageCar saveHeritageCar(HeritageCar heritageCar) {
        logger.debug("saveHeritageCar called");
        return heritageCarRepository.save(heritageCar);
    }

    /*@Override
    public HeritageCar saveHeritageCarbyId(String heritageCarId) {
        logger.debug("saveHeritageCarById called");
        return heritageCarRepository.savebyId(heritageCarId);

    }*/

    @Override
    public void deleteHeritageCarById(String heritageCarId) {
        logger.debug("deleteHeritageCarById called");
        heritageCarRepository.delete(heritageCarId);

    }

    private static Map<String, String> heritageModelImageMap = new HashMap<String, String>();

	static {
		heritageModelImageMap.put("Volvo_PV4", "01_volvo_pv4_large");
		heritageModelImageMap.put("Volvo_PV651", "02_volvo_pv651_large");
	}

	@Override
	public BufferedImage getHeritageCarImageById(String id) {
		// TODO Auto-generated method stub
		StringBuffer imageUrl = new StringBuffer(
				"http://assets.volvocars.com/intl/~/media/shared-assets/images/galleries/inside/our-company/heritage/heritage-models/");
		imageUrl.append(heritageModelImageMap.get(id));
		imageUrl.append(".jpg?w=768");

		URL url;
		BufferedImage heritageCarImage = null;
		try {
			url = new URL(imageUrl.toString());
			heritageCarImage = ImageIO.read(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return heritageCarImage;
	}
}
//    findOne(Integer.valueOf(String.valueOf(id)))
