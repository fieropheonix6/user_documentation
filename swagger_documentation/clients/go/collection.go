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

type Collection struct {

	// Collection id
	Id int64 `json:"id"`

	// Collection title
	Title string `json:"title"`

	// Collection DOI
	Doi string `json:"doi"`

	// Collection Handle
	Handle string `json:"handle"`

	// Api endpoint
	Url string `json:"url"`

	// Various timeline dates
	Timeline Timeline `json:"timeline"`
}
