/* 
 * Figshare API
 *
 * Figshare apiv2. Using Swagger 2.0
 *
 * OpenAPI spec version: 2.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

type ArticleEmbargo struct {

	// True if embargoed
	IsEmbargoed bool `json:"is_embargoed"`

	// Title for embargo
	EmbargoTitle string `json:"embargo_title"`

	// Reason for embargo
	EmbargoReason string `json:"embargo_reason"`

	// List of embargo permissions that are associated with the article. If the type is logged_in and the group_ids list is empty, then the whole institution can see the article; if there are multiple group_ids, then only users that are under those groups can see the article.
	EmbargoOptions []interface{} `json:"embargo_options"`
}
