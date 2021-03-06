/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_AnimationDgmBuildProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_AnimationDgmBuildProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="bld" type="{http://schemas.openxmlformats.org/drawingml/2006/main}ST_AnimationDgmBuildType" default="allAtOnce" />
 *       &lt;attribute name="rev" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_AnimationDgmBuildProperties")
public class CTAnimationDgmBuildProperties {

    @XmlAttribute
    protected String bld;
    @XmlAttribute
    protected Boolean rev;

    /**
     * Gets the value of the bld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBld() {
        if (bld == null) {
            return "allAtOnce";
        } else {
            return bld;
        }
    }

    /**
     * Sets the value of the bld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBld(String value) {
        this.bld = value;
    }

    /**
     * Gets the value of the rev property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRev() {
        if (rev == null) {
            return false;
        } else {
            return rev;
        }
    }

    /**
     * Sets the value of the rev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRev(Boolean value) {
        this.rev = value;
    }

}
