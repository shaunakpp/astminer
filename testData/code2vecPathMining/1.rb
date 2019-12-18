class SingleFunction
    def fun_withReallyLong_And_ComplicatedName(args, param)
        puts(" Hello again world!  ")
    end

    def Another_Fun_withReallyLong_And_ComplicatedName(s)
        puts(s)
    end

    def update_iap!(app_id: nil, purchase_id: nil, data: nil)
      with_tunes_retry do
        r = request(:put) do |req|
          req.url("ra/apps/#{app_id}/iaps/#{purchase_id}")
          req.body = data.to_json
          req.headers['Content-Type'] = 'application/json'
        end
        handle_itc_response(r.body)
      end
    end
def generate_header(newer_tag_name, newer_tag_link, newer_tag_time, older_tag_name, project_url)
      header = ""

      # Generate date string:
      time_string = newer_tag_time.strftime(@options[:date_format])

      # Generate tag name and link
      release_url = if @options[:release_url]
                      format(@options[:release_url], newer_tag_link)
                    else
                      "#{project_url}/tree/#{newer_tag_link}"
                    end
      header += if newer_tag_name.equal?(@options[:unreleased_label])
                  "## [#{newer_tag_name}](#{release_url})\n\n"
                else
                  "## [#{newer_tag_name}](#{release_url}) (#{time_string})\n\n"
                end

      if @options[:compare_link] && older_tag_name
        # Generate compare link
        header += "[Full Changelog](#{project_url}/compare/#{older_tag_name}...#{newer_tag_link})\n\n"
      end

      header
    end
end


def parse_file(path)
      {}.tap do |hash|
        File.readlines(path).each do |line|
          key, value = line.split(SEPARATOR)
          hash[key] = value.strip
        end
      end
end

def minimal_rollback_complete?
      stack = find_stack(stack_name)
      return false unless stack

      return false unless stack.stack_status == 'ROLLBACK_COMPLETE'

      # Finally check if all the minimal resources in the parent template have been deleted
      resp = cfn.describe_stack_resources(stack_name: stack_name)
      resource_statuses = resp.stack_resources.map(&:resource_status).uniq
      resource_statuses == ['DELETE_COMPLETE']
    end

#def log(env, status, header, began_at)
#      now    = Time.now
#      length = extract_content_length(header)
#
#      msg = Hash[
#        http:    env[HTTP_VERSION],
#        verb:    env[REQUEST_METHOD],
#        status:  status.to_s[0..3],
#        ip:      env[HTTP_X_FORWARDED_FOR] || env[REMOTE_ADDR],
#        path:    env[SCRIPT_NAME] + env[PATH_INFO].to_s,
#        length:  length,
#        params:  extract_params(env),
#        elapsed: now - began_at
#      ]
#
#      logger = @logger || env[RACK_ERRORS]
#      # Standard library logger doesn't support write but it supports << which actually
#      # calls to write on the log device without formatting
#      if logger.respond_to?(:write)
#        logger.write(msg)
#      else
#        logger.info(msg)
#      end
#    end
#
