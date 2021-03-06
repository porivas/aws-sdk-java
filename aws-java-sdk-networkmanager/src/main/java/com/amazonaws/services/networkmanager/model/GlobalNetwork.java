/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a global network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GlobalNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalNetwork implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the global network.
     * </p>
     */
    private String globalNetworkId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the global network.
     * </p>
     */
    private String globalNetworkArn;
    /**
     * <p>
     * The description of the global network.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time that the global network was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The state of the global network.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags for the global network.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     */

    public void setGlobalNetworkId(String globalNetworkId) {
        this.globalNetworkId = globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @return The ID of the global network.
     */

    public String getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * <p>
     * The ID of the global network.
     * </p>
     * 
     * @param globalNetworkId
     *        The ID of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalNetwork withGlobalNetworkId(String globalNetworkId) {
        setGlobalNetworkId(globalNetworkId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the global network.
     * </p>
     * 
     * @param globalNetworkArn
     *        The Amazon Resource Name (ARN) of the global network.
     */

    public void setGlobalNetworkArn(String globalNetworkArn) {
        this.globalNetworkArn = globalNetworkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the global network.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the global network.
     */

    public String getGlobalNetworkArn() {
        return this.globalNetworkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the global network.
     * </p>
     * 
     * @param globalNetworkArn
     *        The Amazon Resource Name (ARN) of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalNetwork withGlobalNetworkArn(String globalNetworkArn) {
        setGlobalNetworkArn(globalNetworkArn);
        return this;
    }

    /**
     * <p>
     * The description of the global network.
     * </p>
     * 
     * @param description
     *        The description of the global network.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the global network.
     * </p>
     * 
     * @return The description of the global network.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the global network.
     * </p>
     * 
     * @param description
     *        The description of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalNetwork withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time that the global network was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the global network was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the global network was created.
     * </p>
     * 
     * @return The date and time that the global network was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the global network was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the global network was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalNetwork withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The state of the global network.
     * </p>
     * 
     * @param state
     *        The state of the global network.
     * @see GlobalNetworkState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the global network.
     * </p>
     * 
     * @return The state of the global network.
     * @see GlobalNetworkState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the global network.
     * </p>
     * 
     * @param state
     *        The state of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalNetworkState
     */

    public GlobalNetwork withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the global network.
     * </p>
     * 
     * @param state
     *        The state of the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GlobalNetworkState
     */

    public GlobalNetwork withState(GlobalNetworkState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The tags for the global network.
     * </p>
     * 
     * @return The tags for the global network.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the global network.
     * </p>
     * 
     * @param tags
     *        The tags for the global network.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the global network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalNetwork withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the global network.
     * </p>
     * 
     * @param tags
     *        The tags for the global network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalNetwork withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGlobalNetworkId() != null)
            sb.append("GlobalNetworkId: ").append(getGlobalNetworkId()).append(",");
        if (getGlobalNetworkArn() != null)
            sb.append("GlobalNetworkArn: ").append(getGlobalNetworkArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalNetwork == false)
            return false;
        GlobalNetwork other = (GlobalNetwork) obj;
        if (other.getGlobalNetworkId() == null ^ this.getGlobalNetworkId() == null)
            return false;
        if (other.getGlobalNetworkId() != null && other.getGlobalNetworkId().equals(this.getGlobalNetworkId()) == false)
            return false;
        if (other.getGlobalNetworkArn() == null ^ this.getGlobalNetworkArn() == null)
            return false;
        if (other.getGlobalNetworkArn() != null && other.getGlobalNetworkArn().equals(this.getGlobalNetworkArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNetworkId() == null) ? 0 : getGlobalNetworkId().hashCode());
        hashCode = prime * hashCode + ((getGlobalNetworkArn() == null) ? 0 : getGlobalNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GlobalNetwork clone() {
        try {
            return (GlobalNetwork) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.GlobalNetworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
