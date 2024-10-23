package com.xworkz.form.service;

import com.xworkz.form.dto.FeedBackDTO;

public interface FeedBackService {
	boolean validateAndSave(FeedBackDTO feedBackDTO);

}
