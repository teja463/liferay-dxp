<!DOCTYPE html>
<#include init />
<html class="${root_css_class}" dir="<@liferay.language key=" lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>
		${html_title}
	</title>
	<meta content="initial-scale=1.0, width=device-width" name="viewport" />
	<@liferay_util["include"]
		page=top_head_include />
</head>

<body class="${css_class}">
	<@liferay_ui["quick-access"]
		contentId="#main-content" />
	<@liferay_util["include"]
		page=body_top_include />
	<@liferay.control_menu />
	<div class="container-fluid mt-0 pt-0 px-0" id="wrapper">
		<header class="${header_css_class}">
			<div class="container-fluid" id="banner" role="banner">
				<a class="${logo_css_class}" href="${site_default_url}" title="<@liferay.language_format arguments=" ${site_name}" key="go-to-x" />">
				<img alt="${logo_description}" height="${site_logo_height}" src="${site_logo}" />
				<#if show_site_name>
					${site_name}
				</#if>
				</a>
				<#if has_navigation>
					<button
						aria-controls="navigation"
						aria-expanded="false"
						class="btn-monospaced ml-auto navbar-toggler"
						data-target="#lunarNav"
						data-toggle="liferay-collapse"
						type="button">
						<span class="navbar-toggler-icon"></span>
					</button>
					<#include "${full_templates_path}/navigation.ftl" />
				</#if>
			</div>
		</header>
		<section id="content">
			<h2 class="hide-accessible sr-only" role="heading" aria-level="1">
				${htmlUtil.escape(the_title)}
			</h2>
			<p>Coming from the template context contributor ${sample_text}</p>
			<#if selectable>
				<@liferay_util["include"]
					page=content_include />
				<#else>
					${portletDisplay.recycle()}
					${portletDisplay.setTitle(the_title)}
					<@liferay_theme["wrap-portlet"]
						page="portlet.ftl">
						<@liferay_util["include"]
							page=content_include />
						</@>
			</#if>
		</section>
		<#if show_footer>
			<#include "${full_templates_path}/footer.ftl" />
		</#if>
	</div>
	<@liferay_util["include"]
		page=body_bottom_include />
	<@liferay_util["include"]
		page=bottom_include />
</body>

</html>