// ============================================================================
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// ============================================================================
// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
// 
// This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
// 
// This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public License along with this library; See http://www.gnu.org/licenses/.
// ============================================================================
package tribefire.extension.xml.schemed.mapping.metadata;

import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.meta.GmEntityType;
import com.braintribe.model.meta.GmProperty;
import com.braintribe.model.meta.data.EntityTypeMetaData;

/**
 * the mapping meta data for a {@link GmEntityType}<br/>
 * keep in mind that is the a copy of the GmEntityType in the actual 
 * meta model - they're linked by the type signature, but not the same
 * instance. 
 * 
 * @author pit
 *
 */

public interface EntityTypeMappingMetaData extends EntityTypeMetaData, MappingMetaData, HasNamespace {
	
	
	final EntityType<EntityTypeMappingMetaData> T = EntityTypes.T(EntityTypeMappingMetaData.class);

	GmEntityType getType();	
	void setType(GmEntityType type);
	
	boolean getIsVirtual();
	void setIsVirtual( boolean isVirtual);
	
	boolean getIsSimple();
	void setIsSimple( boolean isSimple);
	
	String getParentTypeXsdName();
	void setParentTypeXsdName(String parentTypeProtoName);
	
	String getNamespace();
	void setNamespace( String namespace);
	
	void setHasAnyType(boolean anyType);
	boolean getHasAnyType();
	
	GmProperty getBacklinkProperty();
	void setBacklinkProperty( GmProperty property);
	
}
