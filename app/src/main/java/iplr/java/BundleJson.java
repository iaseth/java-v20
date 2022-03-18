package iplr.java;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
class MatchJson {
	//
}


@JsonIgnoreProperties(ignoreUnknown = true)
class SeasonJson {
	public List<MatchJson> matches;
	public int year;
}


@JsonIgnoreProperties(ignoreUnknown = true)
class BundleJson {
	public List<SeasonJson> seasons;
}

