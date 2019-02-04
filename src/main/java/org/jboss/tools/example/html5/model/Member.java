/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.tools.example.html5.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.json.JSONArray;
import org.json.JSONObject;

@Entity
@XmlRootElement
@Table(name="members", uniqueConstraints = @UniqueConstraint(columnNames="player_id"))
public class Member implements Serializable {
    /** Default value included to remove warning. Remove or modify at will. **/
    private static final long serialVersionUID = 1L;

    @Id
    private Long player_id;

	public Long getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(Long player_id) {
		this.player_id = player_id;
	}

	@Column(name="creationTime")
    private long creationTime;
    
    public long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}
    
//    public String convertToCSV() {
//    	String result = "";
//    	
//    	result += this.getAMTID() + ",";
//    	JSONObject parsed_qdata = new JSONObject( this.getRData() );
//    	
//    	result += parsed_qdata.getJSONObject("satisfice").getString("item1") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("randoa::0").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::0").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::0").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::0").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::0").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("randon::0").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("randon::0").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("randon::0").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("randon::0").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("randon::0").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("randoa::1").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::1").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::1").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::1").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::1").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("randon::1").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("randon::1").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("randon::1").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("randon::1").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("randon::1").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("randoa::2").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::2").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::2").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::2").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("randoa::2").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("randon::2").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("randon::2").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("randon::2").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("randon::2").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("randon::2").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("accuracy::3").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::3").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::3").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::3").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::3").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("novelty::3").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::3").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::3").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::3").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::3").getString("item5") + ",";
//    	
//    	if ( parsed_qdata.has("itemBasedCF::4"))
//    		result += parsed_qdata.getJSONObject("itemBasedCF::4").getString("item1") + ",";
//    	else result += ",";
//    	
//    	if ( parsed_qdata.has("contentBasedJaccard::4"))
//    		result += parsed_qdata.getJSONObject("contentBasedJaccard::4").getString("item1") + ",";
//    	else result += ",";
//    	
//    	if ( parsed_qdata.has("userBasedCF::4"))
//    		result += parsed_qdata.getJSONObject("userBasedCF::4").getString("item1") + ",";
//    	else result += ",";
//    	
//    	if ( parsed_qdata.has("popularityBased::4"))
//    		result += parsed_qdata.getJSONObject("popularityBased::4").getString("item1") + ",";
//    	else result += ",";
//    	
//    	if ( parsed_qdata.has("itemBasedLastfm::4"))
//    		result += parsed_qdata.getJSONObject("itemBasedLastfm::4").getString("item1") + ",";
//    	else result += ",";
//    	
//    	if ( parsed_qdata.has("contentBasedTag::4"))
//    		result += parsed_qdata.getJSONObject("contentBasedTag::4").getString("item1") + ",";
//    	else result += ",";
//    	
//    	if ( parsed_qdata.has("socialBased::4"))
//    		result += parsed_qdata.getJSONObject("socialBased::4").getString("item1") + ",";
//    	else result += ",";
//    	
//    	result += parsed_qdata.getJSONObject("accuracy::5").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::5").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::5").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::5").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::5").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("novelty::5").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::5").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::5").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::5").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::5").getString("item5") + ",";
//    	
//    	if ( parsed_qdata.has("rank::6") ) {
//	    	JSONArray rankStrings = parsed_qdata.getJSONArray("rank::6");
//	    	for ( int i = 0; i < 7; i++ ) {
//	    		
//	    		String[] explanationStyles = { 
//					"People who listen",	//	item based cf
//					"similar tags as", 		//	jaccard
//					"The lastfm users",		//	user based cf
//					"very popular",			//	popular
//					"Lastfm's data",		//	item based last fm
//					"tagged with", 			//	content based
//					"Your friends"			//	social
//				};
//	    		
//	    		boolean triggered = false;
//	    		for ( int j = 0; j < rankStrings.length(); j++ ) {
//	    			String nextRankString = rankStrings.getString( j );
//	    			if ( nextRankString.contains(explanationStyles[ i ])) {
//	    				result += "" + ( 7 - j ) + ",";
//	    				triggered = true;
//	    			}
//	    		}
//	    		if ( triggered == false )
//	    			result += "0,";
//	    		
//	    	}
//    	}
//    	else {
//    		result += "0,0,0,0,0,0,0,";
//    	}
//    	
//    	result += parsed_qdata.getJSONObject("accuracy::7").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::7").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::7").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::7").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("accuracy::7").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("novelty::7").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::7").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::7").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::7").getString("item4") + ",";
//    	result += parsed_qdata.getJSONObject("novelty::7").getString("item5") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("text::8").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("text::8").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("text::8").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("text::8").getString("item4") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("collapsible::9").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("collapsible::9").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("collapsible::9").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("collapsible::9").getString("item4") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("venn::10").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("venn::10").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("venn::10").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("venn::10").getString("item4") + ",";
//    	
//    	result += parsed_qdata.getJSONObject("cluster::11").getString("item1") + ",";
//    	result += parsed_qdata.getJSONObject("cluster::11").getString("item2") + ",";
//    	result += parsed_qdata.getJSONObject("cluster::11").getString("item3") + ",";
//    	result += parsed_qdata.getJSONObject("cluster::11").getString("item4") + "\n";
//    	
//    	return result;
//    }

}
