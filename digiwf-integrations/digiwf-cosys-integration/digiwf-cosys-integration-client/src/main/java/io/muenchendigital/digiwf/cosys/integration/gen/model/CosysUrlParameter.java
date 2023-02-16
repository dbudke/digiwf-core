/*
 * cosys-eai
 * This application provides the routing for calls from Fachanwendungen to coSys.
 *
 * The version of the OpenAPI document: 2.1.5-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.muenchendigital.digiwf.cosys.integration.gen.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CosysUrlParameter
 */
@JsonPropertyOrder({
  CosysUrlParameter.JSON_PROPERTY_GUID,
  CosysUrlParameter.JSON_PROPERTY_CLIENT,
  CosysUrlParameter.JSON_PROPERTY_ROLE,
  CosysUrlParameter.JSON_PROPERTY_TEMPLATE_NAME,
  CosysUrlParameter.JSON_PROPERTY_TEMPLATE_ID,
  CosysUrlParameter.JSON_PROPERTY_TEMPLATE_TYPE,
  CosysUrlParameter.JSON_PROPERTY_TEMPLATE_SEARCHPARAMETER,
  CosysUrlParameter.JSON_PROPERTY_DATAPOOLID,
  CosysUrlParameter.JSON_PROPERTY_HIDE_TREE,
  CosysUrlParameter.JSON_PROPERTY_HIDE_TEMPLATE_SEARCH,
  CosysUrlParameter.JSON_PROPERTY_HIDE_DRAFT_TAB,
  CosysUrlParameter.JSON_PROPERTY_LOCK_DATACONTEXT,
  CosysUrlParameter.JSON_PROPERTY_RECEIVER_NAME,
  CosysUrlParameter.JSON_PROPERTY_RECEIVER_MAIL,
  CosysUrlParameter.JSON_PROPERTY_RECEIVER_ORG,
  CosysUrlParameter.JSON_PROPERTY_FIRST_TAB_SELECTOR,
  CosysUrlParameter.JSON_PROPERTY_FIRST_TAB
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CosysUrlParameter {
  public static final String JSON_PROPERTY_GUID = "guid";
  private String guid;

  public static final String JSON_PROPERTY_CLIENT = "client";
  private String client;

  /**
   * The role that should be used for the document generation. With the role \&quot;SB\&quot; only released template versions can be used.
   */
  public enum RoleEnum {
    TO("TO"),
    
    TESTER("TESTER"),
    
    SB("SB");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;

  public static final String JSON_PROPERTY_TEMPLATE_NAME = "templateName";
  private String templateName;

  public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
  private String templateId;

  /**
   * The type of the template.
   */
  public enum TemplateTypeEnum {
    STATIC("TEMPLATE_STATIC"),
    
    DYNAMIC("TEMPLATE_DYNAMIC"),
    
    PAPER("TEMPLATE_PAPER");

    private String value;

    TemplateTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TemplateTypeEnum fromValue(String value) {
      for (TemplateTypeEnum b : TemplateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TEMPLATE_TYPE = "templateType";
  private TemplateTypeEnum templateType;

  public static final String JSON_PROPERTY_TEMPLATE_SEARCHPARAMETER = "templateSearchparameter";
  private Object templateSearchparameter;

  public static final String JSON_PROPERTY_DATAPOOLID = "datapoolid";
  private String datapoolid;

  public static final String JSON_PROPERTY_HIDE_TREE = "hideTree";
  private Boolean hideTree;

  public static final String JSON_PROPERTY_HIDE_TEMPLATE_SEARCH = "hideTemplateSearch";
  private Boolean hideTemplateSearch;

  public static final String JSON_PROPERTY_HIDE_DRAFT_TAB = "hideDraftTab";
  private Boolean hideDraftTab;

  public static final String JSON_PROPERTY_LOCK_DATACONTEXT = "lockDatacontext";
  private Boolean lockDatacontext;

  public static final String JSON_PROPERTY_RECEIVER_NAME = "receiverName";
  private String receiverName;

  public static final String JSON_PROPERTY_RECEIVER_MAIL = "receiverMail";
  private String receiverMail;

  public static final String JSON_PROPERTY_RECEIVER_ORG = "receiverOrg";
  private String receiverOrg;

  /**
   * The tab selector.
   */
  public enum FirstTabSelectorEnum {
    TOM("tom"),
    
    URL("url");

    private String value;

    FirstTabSelectorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FirstTabSelectorEnum fromValue(String value) {
      for (FirstTabSelectorEnum b : FirstTabSelectorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FIRST_TAB_SELECTOR = "firstTabSelector";
  private FirstTabSelectorEnum firstTabSelector;

  public static final String JSON_PROPERTY_FIRST_TAB = "firstTab";
  private Integer firstTab;

  public CosysUrlParameter() {
  }

  public CosysUrlParameter guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * The guid of the template.
   * @return guid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuid() {
    return guid;
  }


  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuid(String guid) {
    this.guid = guid;
  }


  public CosysUrlParameter client(String client) {
    
    this.client = client;
    return this;
  }

   /**
   * The number of the client the template is located in.
   * @return client
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClient() {
    return client;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClient(String client) {
    this.client = client;
  }


  public CosysUrlParameter role(RoleEnum role) {
    
    this.role = role;
    return this;
  }

   /**
   * The role that should be used for the document generation. With the role \&quot;SB\&quot; only released template versions can be used.
   * @return role
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  public CosysUrlParameter templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * The name of the template.
   * @return templateName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTemplateName() {
    return templateName;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public CosysUrlParameter templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * The identifier(form number) of the template.
   * @return templateId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTemplateId() {
    return templateId;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public CosysUrlParameter templateType(TemplateTypeEnum templateType) {
    
    this.templateType = templateType;
    return this;
  }

   /**
   * The type of the template.
   * @return templateType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TemplateTypeEnum getTemplateType() {
    return templateType;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateType(TemplateTypeEnum templateType) {
    this.templateType = templateType;
  }


  public CosysUrlParameter templateSearchparameter(Object templateSearchparameter) {
    
    this.templateSearchparameter = templateSearchparameter;
    return this;
  }

   /**
   * The template search parameter.
   * @return templateSearchparameter
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_SEARCHPARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTemplateSearchparameter() {
    return templateSearchparameter;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_SEARCHPARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemplateSearchparameter(Object templateSearchparameter) {
    this.templateSearchparameter = templateSearchparameter;
  }


  public CosysUrlParameter datapoolid(String datapoolid) {
    
    this.datapoolid = datapoolid;
    return this;
  }

   /**
   * The data pool id.
   * @return datapoolid
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATAPOOLID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDatapoolid() {
    return datapoolid;
  }


  @JsonProperty(JSON_PROPERTY_DATAPOOLID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatapoolid(String datapoolid) {
    this.datapoolid = datapoolid;
  }


  public CosysUrlParameter hideTree(Boolean hideTree) {
    
    this.hideTree = hideTree;
    return this;
  }

   /**
   * Hides the template tree.
   * @return hideTree
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_TREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideTree() {
    return hideTree;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_TREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideTree(Boolean hideTree) {
    this.hideTree = hideTree;
  }


  public CosysUrlParameter hideTemplateSearch(Boolean hideTemplateSearch) {
    
    this.hideTemplateSearch = hideTemplateSearch;
    return this;
  }

   /**
   * Hides the template search.
   * @return hideTemplateSearch
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_TEMPLATE_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideTemplateSearch() {
    return hideTemplateSearch;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_TEMPLATE_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideTemplateSearch(Boolean hideTemplateSearch) {
    this.hideTemplateSearch = hideTemplateSearch;
  }


  public CosysUrlParameter hideDraftTab(Boolean hideDraftTab) {
    
    this.hideDraftTab = hideDraftTab;
    return this;
  }

   /**
   * Hides the draft tab.
   * @return hideDraftTab
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIDE_DRAFT_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideDraftTab() {
    return hideDraftTab;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_DRAFT_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideDraftTab(Boolean hideDraftTab) {
    this.hideDraftTab = hideDraftTab;
  }


  public CosysUrlParameter lockDatacontext(Boolean lockDatacontext) {
    
    this.lockDatacontext = lockDatacontext;
    return this;
  }

   /**
   * Locks the data context.
   * @return lockDatacontext
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCK_DATACONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLockDatacontext() {
    return lockDatacontext;
  }


  @JsonProperty(JSON_PROPERTY_LOCK_DATACONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLockDatacontext(Boolean lockDatacontext) {
    this.lockDatacontext = lockDatacontext;
  }


  public CosysUrlParameter receiverName(String receiverName) {
    
    this.receiverName = receiverName;
    return this;
  }

   /**
   * The receiver name.
   * @return receiverName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceiverName() {
    return receiverName;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }


  public CosysUrlParameter receiverMail(String receiverMail) {
    
    this.receiverMail = receiverMail;
    return this;
  }

   /**
   * The receiver mail.
   * @return receiverMail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVER_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceiverMail() {
    return receiverMail;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_MAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiverMail(String receiverMail) {
    this.receiverMail = receiverMail;
  }


  public CosysUrlParameter receiverOrg(String receiverOrg) {
    
    this.receiverOrg = receiverOrg;
    return this;
  }

   /**
   * The receiver org.
   * @return receiverOrg
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECEIVER_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceiverOrg() {
    return receiverOrg;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVER_ORG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceiverOrg(String receiverOrg) {
    this.receiverOrg = receiverOrg;
  }


  public CosysUrlParameter firstTabSelector(FirstTabSelectorEnum firstTabSelector) {
    
    this.firstTabSelector = firstTabSelector;
    return this;
  }

   /**
   * The tab selector.
   * @return firstTabSelector
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_TAB_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FirstTabSelectorEnum getFirstTabSelector() {
    return firstTabSelector;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_TAB_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstTabSelector(FirstTabSelectorEnum firstTabSelector) {
    this.firstTabSelector = firstTabSelector;
  }


  public CosysUrlParameter firstTab(Integer firstTab) {
    
    this.firstTab = firstTab;
    return this;
  }

   /**
   * The first tab.
   * @return firstTab
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFirstTab() {
    return firstTab;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_TAB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstTab(Integer firstTab) {
    this.firstTab = firstTab;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosysUrlParameter cosysUrlParameter = (CosysUrlParameter) o;
    return Objects.equals(this.guid, cosysUrlParameter.guid) &&
        Objects.equals(this.client, cosysUrlParameter.client) &&
        Objects.equals(this.role, cosysUrlParameter.role) &&
        Objects.equals(this.templateName, cosysUrlParameter.templateName) &&
        Objects.equals(this.templateId, cosysUrlParameter.templateId) &&
        Objects.equals(this.templateType, cosysUrlParameter.templateType) &&
        Objects.equals(this.templateSearchparameter, cosysUrlParameter.templateSearchparameter) &&
        Objects.equals(this.datapoolid, cosysUrlParameter.datapoolid) &&
        Objects.equals(this.hideTree, cosysUrlParameter.hideTree) &&
        Objects.equals(this.hideTemplateSearch, cosysUrlParameter.hideTemplateSearch) &&
        Objects.equals(this.hideDraftTab, cosysUrlParameter.hideDraftTab) &&
        Objects.equals(this.lockDatacontext, cosysUrlParameter.lockDatacontext) &&
        Objects.equals(this.receiverName, cosysUrlParameter.receiverName) &&
        Objects.equals(this.receiverMail, cosysUrlParameter.receiverMail) &&
        Objects.equals(this.receiverOrg, cosysUrlParameter.receiverOrg) &&
        Objects.equals(this.firstTabSelector, cosysUrlParameter.firstTabSelector) &&
        Objects.equals(this.firstTab, cosysUrlParameter.firstTab);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, client, role, templateName, templateId, templateType, templateSearchparameter, datapoolid, hideTree, hideTemplateSearch, hideDraftTab, lockDatacontext, receiverName, receiverMail, receiverOrg, firstTabSelector, firstTab);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosysUrlParameter {\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
    sb.append("    templateSearchparameter: ").append(toIndentedString(templateSearchparameter)).append("\n");
    sb.append("    datapoolid: ").append(toIndentedString(datapoolid)).append("\n");
    sb.append("    hideTree: ").append(toIndentedString(hideTree)).append("\n");
    sb.append("    hideTemplateSearch: ").append(toIndentedString(hideTemplateSearch)).append("\n");
    sb.append("    hideDraftTab: ").append(toIndentedString(hideDraftTab)).append("\n");
    sb.append("    lockDatacontext: ").append(toIndentedString(lockDatacontext)).append("\n");
    sb.append("    receiverName: ").append(toIndentedString(receiverName)).append("\n");
    sb.append("    receiverMail: ").append(toIndentedString(receiverMail)).append("\n");
    sb.append("    receiverOrg: ").append(toIndentedString(receiverOrg)).append("\n");
    sb.append("    firstTabSelector: ").append(toIndentedString(firstTabSelector)).append("\n");
    sb.append("    firstTab: ").append(toIndentedString(firstTab)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

